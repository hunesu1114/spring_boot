package hello.order;

import java.util.concurrent.atomic.AtomicInteger;

public interface OrderService {
    void order();

    void cancel();

    // 멀티스레드 상황에서 안전하게 값을 증가, 감소 시킬 수 있는 타입
    AtomicInteger getStock();
}
