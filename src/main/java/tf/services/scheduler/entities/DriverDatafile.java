package tf.services.scheduler.entities;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import java.time.ZonedDateTime;
import java.util.Date;

@Entity
@Table(name="DRIVER_DATAFILE")
public class DriverDatafile {

  @Id()
  @Column(name="DATAFILE_ID")
  private long id;

  @Column(name="PARSE_STATE")
  private String parseState;

  @Column(name="FILE_NAME")
  private String fileName;

  @Column(name="UPLOAD_DATE")
  private ZonedDateTime uploadTime;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public ZonedDateTime getUploadTime() {
    return uploadTime;
  }

  public void setUploadTime(ZonedDateTime uploadTime) {
    this.uploadTime = uploadTime;
  }

  public String getParseState() {
	 return parseState;
  }

  public void setParseState(String parseState) {
	 this.parseState = parseState;
  }
}

