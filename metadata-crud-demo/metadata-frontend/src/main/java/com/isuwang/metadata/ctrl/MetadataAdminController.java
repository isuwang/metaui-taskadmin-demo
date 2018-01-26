package com.isuwang.metadata.ctrl;

import com.isuwang.dapeng.core.SoaException;
import com.isuwang.soa.meta.MetadataServiceClient;
import com.isuwang.soa.meta.domain.TFieldMetaRequest;
import com.isuwang.soa.meta.domain.TFieldMetaResponse;
import com.isuwang.soa.meta.domain.TFieldMetaSaveRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("uc/metadata/admin")
public class MetadataAdminController {

    @RequestMapping(value = "queryFieldMetas", method = RequestMethod.GET)
    @ResponseBody
    public TFieldMetaResponse queryFieldMetas(TFieldMetaRequest request, com.isuwang.soa.common.util.TPageRequest pageRequest) throws SoaException {
        request.setPageRequest(pageRequest);
        return new MetadataServiceClient().queryFieldMetas(request);
    }

    @RequestMapping(value = "deleteFieldMeta", method = RequestMethod.POST)
    @ResponseBody
    public void deleteFieldMeta(int id) throws SoaException {
        new MetadataServiceClient().deleteFieldMeta(id);
    }

    @RequestMapping(value = "createFieldMeta", method = RequestMethod.POST)
    @ResponseBody
    public void createFieldMeta(@RequestBody TFieldMetaSaveRequest request) throws SoaException {
        new MetadataServiceClient().createFieldMeta(request);

    }

    @RequestMapping(value = "updateFieldMeta", method = RequestMethod.POST)
    @ResponseBody
    public void updateFieldMeta(@RequestBody TFieldMetaSaveRequest request) throws SoaException {
        new MetadataServiceClient().updateFieldMeta(request);
    }
}
