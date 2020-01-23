package kata1;

import java.util.Date;

public class Persona {

    private String name;
    private Date birthDate;
    
    //Constructor.
    public Persona(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public long getAge() {
        return getYearsInDays(
                getDaysInHours(
                getHoursInMinutes(
                getMinutesInSeconds(
                getSecondsInMilliseconds(
                (today().getTime() - birthDate.getTime()))))));

    }

    private long getSecondsInMilliseconds(long milliseconds) {
        return milliseconds / 1000;
    }

    private long getMinutesInSeconds(long seconds) {
        return seconds / 60;
    }

    private long getHoursInMinutes(long minutes) {
        return minutes / 60;
    }

    private long getDaysInHours(long hours) {
        return hours / 24;
    }

    private long getYearsInDays(long days) {
        return (long) (days / 365.25);
    }
    //Devuelvo un objeto de clase Date.
    private Date today() {
        return new Date();
    }
    ////Devuelvo el nombre.
    public String getName() {
        return name;
    }
    //Devuelvo la fecha de cumpleaños.
    public Date getBirthDate() {
        return birthDate;
    }
}
