package com.neuranexa.core.mapper;

import java.util.List;

public interface GenericDtoMapper<D, M> {

    D toDto(M model);

    M toModel(D document);

    List<D> toDtoList(List<M> modelList);

    List<M> toModelList(List<D> documentList);
}
