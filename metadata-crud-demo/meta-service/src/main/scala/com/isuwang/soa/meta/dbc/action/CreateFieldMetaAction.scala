package com.isuwang.soa.meta.dbc.action

import javax.sql.DataSource

import com.isuwang.commons.Action
import com.isuwang.soa.meta.domain.TFieldMetaSaveRequest
import wangzx.scala_commons.sql._
import com.isuwang.commons.converters.Implicits._
import com.isuwang.commons.converters.SqlImplicits._
import com.isuwang.dapeng.core.helper.SoaHeaderHelper
import com.isuwang.soa.meta.db.dbc.DbcResources
import com.isuwang.soa.meta.dbc.MetadataSql.datasource

/**
  * Created by WahsonLeung on 2017/12/14
  */
class CreateFieldMetaAction(request: TFieldMetaSaveRequest) extends Action[Unit]{

  implicit val datasource: DataSource = DbcResources.metadbDataSorce
  override def preCheck: Unit = {

  }

  override def action: Unit = {
    val operator = SoaHeaderHelper.getSoaHeader(true).getOperatorId.orElse(0)
    esqlKey(
      sql"""
           INSERT INTO fields SET
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
              `length` = ${request.length.orElse(null)},
              max_length = ${request.maxLength.orElse(null)},
              min_length = ${request.minLength.orElse(null)},
              `regexp` = ${request.regexp.orElse(null)},
              prompt = ${request.prompt.orElse(null)},
              `min` = ${request.min.orElse(null)},
              `max` = ${request.max.orElse(null)},
              candidates = ${request.candidates.orElse(null)},
              candidate_label = ${request.candidateLabel.orElse(null)},
              candidate_value = ${request.candidateValue.orElse(null)},
              placeholder = ${request.placeholder.orElse(null)},
              src_key = ${request.srcKey.orElse(null)},
              created_by = ${operator},
              updated_by = ${operator}
         """)

  }
}
