package com.techelevator.countrylanguage;

import com.techelevator.city.City;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class JDBCCountryLanguageDAO implements CountryLanguageDAO{

    private JdbcTemplate jdbcTemplate;

    public JDBCCountryLanguageDAO(DataSource dataSource){

        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<CountryLanguage> getLanguagesForCountry(String countrycode){
        ArrayList<CountryLanguage> list = new ArrayList<>();
        String sql ="SELECT countrycode, language, isofficial, percentage "+
                "FROM countrylanguage "+
                "WHERE countrycode=?";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, countrycode);
        while (results.next()) {
          CountryLanguage lang = mapRowToLanguage(results);
          list.add(lang);
        }
        return list;
    }



    private CountryLanguage mapRowToLanguage(SqlRowSet results){
        CountryLanguage l =new CountryLanguage();
        l.setCountryCode(results.getString("countrycode"));
        l.setLanguage(results.getString("language"));
        l.setOfficial(results.getBoolean("isOfficial"));
        l.setPercentage(results.getDouble("percentage"));
        return l;
    }

    @Override
    public void updateLanguage(CountryLanguage cl) {
        String sql = "UPDATE countrylanguage "+
                "SET isOffical = ?, percentage=?, "+
                "WHERE countrycode =? AND language = ?";
        jdbcTemplate.update(sql, cl.isOfficial(), cl.getPercentage(), cl.getCountryCode(), cl.getLanguage());

    }
}
