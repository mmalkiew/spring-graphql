package pl.mmalkiew.graphql.repository.impl;

import org.springframework.stereotype.Service;
import pl.mmalkiew.graphql.criteria.SampleSearchCriteria;
import pl.mmalkiew.graphql.model.Sample;
import pl.mmalkiew.graphql.repository.SampleRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class SampleRepositoryImpl implements SampleRepository {

    private static final List<Sample> SAMPLES = new ArrayList<>();
    static {
        Sample sample = new Sample();
        sample.setName("test");

        SAMPLES.add(sample);

        Sample other = new Sample();
        other.setName("other");

        SAMPLES.add(other);

    }

    @Override
    public List<Sample> findAllSamples() {
        return SAMPLES;
    }

    @Override
    public Optional<Sample> findSampleByName(String name) {
        return SAMPLES.stream()
                      .filter(sample -> sample.getName().equals(name))
                      .findFirst();
    }

    @Override
    public List<Sample> findByCriteria(SampleSearchCriteria criteria) {
        return SAMPLES.stream()
                      .filter(sample -> sample.getName().equals(criteria.getName()))
                      .collect(Collectors.toList());
    }


}

