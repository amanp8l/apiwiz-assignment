package com.example.APIwiz.Repository;

import com.example.APIwiz.Model.Last30Days;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public interface RepoDb extends JpaRepository<Last30Days, Integer> {

    @Query("SELECT l.date, CASE ?1 " +
            "WHEN 'INR' THEN l.INR " +
            "WHEN 'GBP' THEN l.GBP " +
            "WHEN 'EUR' THEN l.EUR " +
            "WHEN 'JPY' THEN l.JPY " +
            "WHEN 'CHF' THEN l.CHF " +
            "WHEN 'USD' THEN l.USD " +
            "WHEN 'CAD' THEN l.CAD " +
            "WHEN 'NZD' THEN l.NZD " +
            "WHEN 'AUD' THEN l.AUD " +
            "WHEN 'NOK' THEN l.NOK " +
            "WHEN 'SEK' THEN l.SEK " +
            "ELSE null END " +
            "FROM Last30Days l")
    List<Object[]> getDateAndCurrency(String currency);

}
