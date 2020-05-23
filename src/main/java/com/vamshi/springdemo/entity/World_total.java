package com.vamshi.springdemo.entity;

public class World_total {
	
	    private String total_cases;

	    private String deaths_per_1m_population;

	    private String total_deaths;

	    private String new_cases;

	    private String new_deaths;

	    private String statistic_taken_at;

	    private String serious_critical;

	    private String total_cases_per_1m_population;

	    private String total_recovered;

	    private String active_cases;
	    
	    public World_total() {}

	    public String getTotal_cases ()
	    {
	        return total_cases;
	    }

	    public void setTotal_cases (String total_cases)
	    {
	        this.total_cases = total_cases;
	    }

	    public String getDeaths_per_1m_population ()
	    {
	        return deaths_per_1m_population;
	    }

	    public void setDeaths_per_1m_population (String deaths_per_1m_population)
	    {
	        this.deaths_per_1m_population = deaths_per_1m_population;
	    }

	    public String getTotal_deaths ()
	    {
	        return total_deaths;
	    }

	    public void setTotal_deaths (String total_deaths)
	    {
	        this.total_deaths = total_deaths;
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

	    public String getStatistic_taken_at ()
	    {
	        return statistic_taken_at;
	    }

	    public void setStatistic_taken_at (String statistic_taken_at)
	    {
	        this.statistic_taken_at = statistic_taken_at;
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

	    public String getActive_cases ()
	    {
	        return active_cases;
	    }

	    public void setActive_cases (String active_cases)
	    {
	        this.active_cases = active_cases;
	    }

	    @Override
	    public String toString()
	    {
	        return "ClassPojo [total_cases = "+total_cases+", deaths_per_1m_population = "+deaths_per_1m_population+", total_deaths = "+total_deaths+", new_cases = "+new_cases+", new_deaths = "+new_deaths+", statistic_taken_at = "+statistic_taken_at+", serious_critical = "+serious_critical+", total_cases_per_1m_population = "+total_cases_per_1m_population+", total_recovered = "+total_recovered+", active_cases = "+active_cases+"]";
	    }

}
