package com.neuranexa.core.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface GenericDocMapper<M, D> {

    GenericDocMapper INSTANCE = Mappers.getMapper(GenericDocMapper.class);

    D toDocument(M model);

    M toModel(D document);

    List<D> toDcumentList(List<M> modelList);

    List<M> toModelList(List<D> documentList);
}
