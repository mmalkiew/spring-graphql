package pl.mmalkiew.graphql.repository;

import pl.mmalkiew.graphql.criteria.SampleSearchCriteria;
import pl.mmalkiew.graphql.model.Sample;

import java.util.List;
import java.util.Optional;

public interface SampleRepository {

    List<Sample> findAllSamples();

    Optional<Sample> findSampleByName(String name);

    List<Sample> findByCriteria(SampleSearchCriteria criteria);
}
