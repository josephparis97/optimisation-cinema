import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalTime;
import java.time.Period;
import java.util.Date;

import javax.print.attribute.standard.DateTimeAtCreation;

public class Film {
	private String titre;
	private Duration duree;
	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

	public Film(String titre, String duree)
	{
		this.titre=titre;
		//"08:30:00"
		this.duree=Duration.between (LocalTime.MIN ,LocalTime.parse(duree));                                   	
	}

	@Override
	public String toString() {
		return "Film [titre=" + titre + ", duree=" + duree.toString() + "]";
	}

	
	

}
