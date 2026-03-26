package com.springboot.order.mapper;

import com.springboot.order.Order;
import com.springboot.order.OrderPostDto;
import com.springboot.order.OrderResponseDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-26T16:52:37+0900",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.1.jar, environment: Java 17.0.13 (Oracle Corporation)"
)
@Component
public class OrderMapperImpl implements OrderMapper {

    @Override
    public Order orderPostDtoToOrder(OrderPostDto orderPostDto) {
        if ( orderPostDto == null ) {
            return null;
        }

        long memberId = 0L;
        long coffeeId = 0L;

        memberId = orderPostDto.getMemberId();
        coffeeId = orderPostDto.getCoffeeId();

        Order order = new Order( memberId, coffeeId );

        return order;
    }

    @Override
    public OrderResponseDto orderToOrderResponseDto(Order order) {
        if ( order == null ) {
            return null;
        }

        long memberId = 0L;
        long coffeeId = 0L;

        memberId = order.getMemberId();
        coffeeId = order.getCoffeeId();

        OrderResponseDto orderResponseDto = new OrderResponseDto( memberId, coffeeId );

        return orderResponseDto;
    }
}
