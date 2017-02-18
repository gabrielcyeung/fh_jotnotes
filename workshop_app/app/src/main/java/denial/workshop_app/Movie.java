package denial.workshop_app;

/**
 * Created by slaps on 2017-02-18.
 */

public class Movie {
    private String title;
    private String year;
    Movie(String title,String year)
    {
        this.title=title;
        this.year=year;

    }
    String getTitle()
    {
        return title;
    }
    String getYear()
    {
        return year;
    }
}
