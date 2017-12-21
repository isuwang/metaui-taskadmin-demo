package com.isuwang.soa.meta.service;

import com.isuwang.dapeng.core.SoaException;
import com.isuwang.soa.meta.dbc.action.CreateFieldMetaAction;
import com.isuwang.soa.meta.dbc.action.DeleteFieldMetaAction;
import com.isuwang.soa.meta.dbc.action.QueryFieldMetas;
import com.isuwang.soa.meta.dbc.action.UpdateFieldMetaAction;
import com.isuwang.soa.meta.domain.*;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 *
 * @author wahsonleung
 * @date 2017/7/19
 */
@Transactional(value = "metadb", rollbackFor = Exception.class)
public class MetadataServiceImpl implements MetadataService {

    @Override
    public TFieldMetaResponse queryFieldMetas(TFieldMetaRequest request) throws SoaException {
        return new QueryFieldMetas(request).execute();
    }

    @Override
    public void createFieldMeta(TFieldMetaSaveRequest request) throws SoaException {
        new CreateFieldMetaAction(request).execute();
    }

    @Override
    public void updateFieldMeta(TFieldMetaSaveRequest request) throws SoaException {
        new UpdateFieldMetaAction(request).execute();
    }

    @Override
    public void deleteFieldMeta(Integer id) throws SoaException {
        new DeleteFieldMetaAction(id).execute();
    }

}
