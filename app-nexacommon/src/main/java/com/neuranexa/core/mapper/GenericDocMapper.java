package com.neuranexa.core.mapper;

import java.util.List;

public interface GenericDocMapper<M, D> {

    D toDocument(M model);

    M toModel(D document);

    List<D> toDcumentList(List<M> modelList);

    List<M> toModelList(List<D> documentList);
}
