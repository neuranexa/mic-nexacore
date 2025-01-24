package com.neuranexa.core.mapper;

import java.util.List;

public class GenericMapperUtil {

    public static <D, M> D toDto(GenericDtoMapper<D, M> mapper, M model) {
        return mapper.toDto(model);
    }

    public static <D, M> M toModel(GenericDtoMapper<D, M> mapper, D document) {
        return mapper.toModel(document);
    }

    public static <D, M> List<D> toDtoList(GenericDtoMapper<D, M> mapper, List<M> modelList) {
        return mapper.toDtoList(modelList);
    }

    public static <D, M> List<M> toModelList(GenericDtoMapper<D, M> mapper, List<D> documentList) {
        return mapper.toModelList(documentList);
    }
}
