package dev.saranda.springgcpdatastore.repository;

import dev.saranda.springgcpdatastore.entity.Goal;
import org.springframework.cloud.gcp.data.datastore.repository.DatastoreRepository;

public interface GoalRepository extends DatastoreRepository<Goal, String> {
}
