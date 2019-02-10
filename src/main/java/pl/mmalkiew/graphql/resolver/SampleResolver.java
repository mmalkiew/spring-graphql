package pl.mmalkiew.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.springframework.stereotype.Component;
import pl.mmalkiew.graphql.criteria.SampleSearchCriteria;
import pl.mmalkiew.graphql.model.Sample;
import pl.mmalkiew.graphql.repository.SampleRepository;

import java.util.List;
import java.util.Optional;

@Component
public class SampleResolver implements GraphQLResolver<Sample> {

    private final SampleRepository sampleRepository;

    public SampleResolver(SampleRepository sampleRepository) {
        this.sampleRepository = sampleRepository;
    }

    public List<Sample> findAllSamples() {
        return sampleRepository.findAllSamples();
    }

    public Optional<Sample> findSampleByName(String name) {
        return sampleRepository.findSampleByName(name);
    }

    public List<Sample> findByCriteria(SampleSearchCriteria criteria) {
        return sampleRepository.findByCriteria(criteria);
    }


}
