package pl.mmalkiew.graphql.repository.impl;

import org.springframework.stereotype.Service;
import pl.mmalkiew.graphql.model.Sample;
import pl.mmalkiew.graphql.repository.SampleRepository;

import java.util.Collections;
import java.util.List;

@Service
public class SampleRepositoryImpl implements SampleRepository {

    @Override
    public List<Sample> findAllSamples() {
        Sample sample = new Sample();
        sample.setName("TEST");
        return Collections.singletonList(sample);
    }
}

