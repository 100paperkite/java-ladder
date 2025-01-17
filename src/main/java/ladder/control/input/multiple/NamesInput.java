package ladder.control.input.multiple;

import ladder.model.participant.Name;
import ladder.view.View;

public class NamesInput extends MultipleInput<Name> {
    public NamesInput(View view) {
        super(view);
    }

    @Override
    protected Name parse(String rawValue) {
        return new Name(rawValue);
    }
}
