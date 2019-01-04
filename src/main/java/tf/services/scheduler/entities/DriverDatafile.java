package tf.services.scheduler.entities;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;

@Entity
@Table(name="DRIVER_DATAFILE")
public class DriverDatafile {

  @Id()
  @Column(name="DATAFILE_ID")
  private long id;

  @Column(name="PARSE_STATE")
  private String parseState;

  public String getParseState() {
	 return parseState;
  }

  public void setParseState(String parseState) {
	 this.parseState = parseState;
  }
}

