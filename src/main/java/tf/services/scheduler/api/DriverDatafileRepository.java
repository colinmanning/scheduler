package tf.services.scheduler.api;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import tf.services.scheduler.entities.DriverDatafile;

@RepositoryRestResource(collectionResourceRel = "driverfiles", path = "driverfiles")
public interface DriverDatafileRepository extends PagingAndSortingRepository<DriverDatafile, Long> {

  List<DriverDatafile> findByParseState(@Param("value") String value);
}