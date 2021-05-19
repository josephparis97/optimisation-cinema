import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Seance {
	private Film film;
	private Date date;
	
	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	public Seance(Film film, String date)
	{
		this.film=film;
		try {
			this.date=format.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "Seance [film=" + film + ", date=" + date.toString() + "]";
	}
	
	
}
