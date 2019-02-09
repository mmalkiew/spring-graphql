package pl.mmalkiew.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;
import pl.mmalkiew.graphql.model.Sample;
import pl.mmalkiew.graphql.repository.SampleRepository;

import java.util.List;

@Component
public class QueryResolver implements GraphQLQueryResolver {

    private final SampleRepository sampleRepository;

    public QueryResolver(SampleRepository sampleRepository) {
        this.sampleRepository = sampleRepository;
    }

    public List<Sample> findAllSamples() {
        return sampleRepository.findAllSamples();
    }
}
