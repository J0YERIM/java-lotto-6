package lotto.service;

import java.util.ArrayList;
import java.util.List;
import lotto.domain.Lotto;
import lotto.utils.NumberGenerator;

public class LottoService {

    private final NumberGenerator numberGenerator;

    public LottoService(NumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
    }

    public Lotto generateSingleLotto() {
        // TODO: 하나의 로또 생성 로직 구현
        List<Integer> numbers = numberGenerator.generateUniqueNumbers();
        return new Lotto(numbers);
    }

    public List<Lotto> generateMultipleLottos(int numberOfTickets) {
        // TODO: 주어진 티켓 수에 따라 여러 개의 로또 생성 로직 구현
        List<Lotto> lottos = new ArrayList<>();
        for (int i = 0; i < numberOfTickets; i++) {
            lottos.add(generateSingleLotto());
        }
        return lottos;
    }

    // public void validateLotto(Lotto lotto) {
    // // TODO: 로또의 유효성을 검사하는 로직 구현
    // }
}
