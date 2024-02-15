package com.yma.restapi.mapper;

public interface Mapper <E,D>{

    E mapTo(D b);
    D mapFrom(E e);
}
