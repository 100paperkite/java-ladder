package ladder.view.input;

import ladder.view.View;

public class NameView implements View {
    @Override
    public void render() {
        System.out.println("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)");
    }
}
