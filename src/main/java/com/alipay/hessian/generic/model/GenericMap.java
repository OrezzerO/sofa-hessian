/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alipay.hessian.generic.model;

import java.io.Serializable;
import java.util.Map;

/**
 * Map的包装类
 * 由于Hessian对Map接口的特殊处理, 用户自定义的Map都需要此类包装
 *
 * @author <a href="mailto:caojie.cj@antfin.com">Jie Cao</a>
 * @since 5.3.0
 */
public class GenericMap implements Serializable {

    // actually, we won't serialize this class itself
    private static final long serialVersionUID = 6183635628271812505L;

    private String            type;

    private Map               map;

    /**
     * 默认构造函数, 供hessian反序列化
     */
    private GenericMap() {
    }

    public GenericMap(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }
}
