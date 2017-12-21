package com.isuwang.soa.meta.dbc.action

import com.isuwang.commons.Action
import com.isuwang.dapeng.core.helper.SoaHeaderHelper
import com.isuwang.soa.meta.domain.TFieldMetaSaveRequest
import wangzx.scala_commons.sql._
import com.isuwang.commons.converters.SqlImplicits._
import com.isuwang.soa.meta.dbc.MetadataSql.datasource

/**
  * Created by WahsonLeung on 2017/12/14
  */
class UpdateFieldMetaAction(request: TFieldMetaSaveRequest) extends Action[Unit]{

  override def preCheck: Unit = {
    assert(request.id.isPresent, "fieldMeta id not found")
  }

  override def action: Unit = {
    val operator = SoaHeaderHelper.getSoaHeader(true).getOperatorId.orElse(0)
    esql(
      sql"""
           UPDATE fields SET
              struct_name = ${request.structName},
              `name` = ${request.name},
              element = ${request.element.orElse(null)},
              label = ${request.label},
              required = ${request.isRequired},
              multi = ${request.multi},
              editable = ${request.editable},
              validate = ${request.validate},
              visible = ${request.visible},
              disabled = ${request.disabled},
              format = ${request.format.orElse(null)},
              `length` = ${request.length.orElse(0)},
              max_length = ${request.maxLength.orElse(0)},
              min_length = ${request.minLength.orElse(0)},
              `regexp` = ${request.regexp.orElse(null)},
              prompt = ${request.prompt.orElse(null)},
              `min` = ${request.min.orElse(null)},
              `max` = ${request.max.orElse(null)},
              candidates = ${request.candidates.orElse(null)},
              candidate_label = ${request.candidateLabel.orElse(null)},
              candidate_value = ${request.candidateValue.orElse(null)},
              placeholder = ${request.placeholder.orElse(null)},
              src_key = ${request.srcKey.orElse(null)},
              updated_at = now(),
              updated_by = ${operator}
         WHERE id = ${request.id.get}
         """)
  }
}
