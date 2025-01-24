package com.neuranexa.core.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface GenericDtoMapper<D, M> {

    GenericDtoMapper INSTANCE = Mappers.getMapper(GenericDtoMapper.class);

    D toDto(M model);

    M toModel(D document);

    List<D> toDtoList(List<M> modelList);

    List<M> toModelList(List<D> documentList);
}
