package com.vamshi.springdemo.entity;

public class Countries_stat {

		private String cases;

	    private String deaths_per_1m_population;

	    private String new_cases;

	    private String new_deaths;

	    private String country_name;

	    private String serious_critical;

	    private String total_cases_per_1m_population;

	    private String total_recovered;

	    private String total_tests;

	    private String region;

	    private String active_cases;

	    private String deaths;

	    private String tests_per_1m_population;

	    public String getCases ()
	    {
	        return cases;
	    }

	    public void setCases (String cases)
	    {
	        this.cases = cases;
	    }

	    public String getDeaths_per_1m_population ()
	    {
	        return deaths_per_1m_population;
	    }

	    public void setDeaths_per_1m_population (String deaths_per_1m_population)
	    {
	        this.deaths_per_1m_population = deaths_per_1m_population;
	    }

	    public String getNew_cases ()
	    {
	        return new_cases;
	    }

	    public void setNew_cases (String new_cases)
	    {
	        this.new_cases = new_cases;
	    }

	    public String getNew_deaths ()
	    {
	        return new_deaths;
	    }

	    public void setNew_deaths (String new_deaths)
	    {
	        this.new_deaths = new_deaths;
	    }

	    public String getCountry_name ()
	    {
	        return country_name;
	    }

	    public void setCountry_name (String country_name)
	    {
	        this.country_name = country_name;
	    }

	    public String getSerious_critical ()
	    {
	        return serious_critical;
	    }

	    public void setSerious_critical (String serious_critical)
	    {
	        this.serious_critical = serious_critical;
	    }

	    public String getTotal_cases_per_1m_population ()
	    {
	        return total_cases_per_1m_population;
	    }

	    public void setTotal_cases_per_1m_population (String total_cases_per_1m_population)
	    {
	        this.total_cases_per_1m_population = total_cases_per_1m_population;
	    }

	    public String getTotal_recovered ()
	    {
	        return total_recovered;
	    }

	    public void setTotal_recovered (String total_recovered)
	    {
	        this.total_recovered = total_recovered;
	    }

	    public String getTotal_tests ()
	    {
	        return total_tests;
	    }

	    public void setTotal_tests (String total_tests)
	    {
	        this.total_tests = total_tests;
	    }

	    public String getRegion ()
	    {
	        return region;
	    }

	    public void setRegion (String region)
	    {
	        this.region = region;
	    }

	    public String getActive_cases ()
	    {
	        return active_cases;
	    }

	    public void setActive_cases (String active_cases)
	    {
	        this.active_cases = active_cases;
	    }

	    public String getDeaths ()
	    {
	        return deaths;
	    }

	    public void setDeaths (String deaths)
	    {
	        this.deaths = deaths;
	    }

	    public String getTests_per_1m_population ()
	    {
	        return tests_per_1m_population;
	    }

	    public void setTests_per_1m_population (String tests_per_1m_population)
	    {
	        this.tests_per_1m_population = tests_per_1m_population;
	    }

	    @Override
	    public String toString()
	    {
	        return "ClassPojo [cases = "+cases+", deaths_per_1m_population = "+deaths_per_1m_population+", new_cases = "+new_cases+", new_deaths = "+new_deaths+", country_name = "+country_name+", serious_critical = "+serious_critical+", total_cases_per_1m_population = "+total_cases_per_1m_population+", total_recovered = "+total_recovered+", total_tests = "+total_tests+", region = "+region+", active_cases = "+active_cases+", deaths = "+deaths+", tests_per_1m_population = "+tests_per_1m_population+"]";
	    }
}
