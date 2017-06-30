package filter;

import java.util.List;

public class AndCriteria implements Criteria {

    private final Criteria criteria;

    private final Criteria otherCriteria;

    public AndCriteria(final Criteria criteria,
                       final Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        final List<Person> firstCriteriapersons = criteria.meetCriteria(persons);

        return otherCriteria.meetCriteria(firstCriteriapersons);
    }

}
