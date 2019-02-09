package pl.mmalkiew.graphql.repository;

import pl.mmalkiew.graphql.model.Sample;

import java.util.List;

public interface SampleRepository {

    List<Sample> findAllSamples();
}
