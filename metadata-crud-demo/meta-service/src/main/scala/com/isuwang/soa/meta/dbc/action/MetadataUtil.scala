package com.isuwang.soa.meta.dbc.action

import java.io.StringReader
import javax.xml.bind.JAXB

import com.isuwang.commons.converters.Implicits._
import com.isuwang.dapeng.core.metadata._
import com.isuwang.dapeng.remoting.fake.metadata.MetadataClient


/**
  * Created by wahsonleung on 2017/7/27.
  */
object MetadataUtil {

  def getService(serviceName: String, version: String): Service = {
    val metadata = new MetadataClient(serviceName, version).getServiceMetadata()
    assert(metadata != null, s"获取 ${serviceName}::${version} 时的metadata出错")

    val reader = new StringReader(metadata)
    JAXB.unmarshal(reader, classOf[Service])

  }

  def isMetaDefinedKey(key: String): Boolean = key.startsWith("m.")

}
