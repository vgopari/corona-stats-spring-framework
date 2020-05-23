package com.vamshi.springdemo.entity;

public class Details {

	private Countries_stat[] countries_stat;

    private String statistic_taken_at;

    private World_total world_total;

    public Countries_stat[] getCountries_stat ()
    {
        return countries_stat;
    }

    public void setCountries_stat (Countries_stat[] countries_stat)
    {
        this.countries_stat = countries_stat;
    }

    public String getStatistic_taken_at ()
    {
        return statistic_taken_at;
    }

    public void setStatistic_taken_at (String statistic_taken_at)
    {
        this.statistic_taken_at = statistic_taken_at;
    }

    public World_total getWorld_total ()
    {
        return world_total;
    }

    public void setWorld_total (World_total world_total)
    {
        this.world_total = world_total;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [countries_stat = "+countries_stat+", statistic_taken_at = "+statistic_taken_at+", world_total = "+world_total+"]";
    }
}
