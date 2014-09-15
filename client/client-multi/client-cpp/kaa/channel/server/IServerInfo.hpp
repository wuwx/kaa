/*
 * Copyright 2014 CyberVision, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

#ifndef ISERVERINFO_HPP_
#define ISERVERINFO_HPP_

#include <string>

#include <botan/botan.h>

#include <boost/cstdint.hpp>
#include <boost/shared_ptr.hpp>

#include "kaa/gen/BootstrapGen.hpp"
#include "kaa/channel/ServerType.hpp"

namespace kaa {

/**
 * Interface for server information.
 * Used by @link IDataChannel @endlink and @link IKaaChannelManager @endlink
 */
class IServerInfo {
public:
    /**
     * Retrieves channel type supported by the server
     *
     * @see ChannelType
     */
    virtual ChannelType getChannelType() const = 0;

    /**
     * Retrieves server type
     *
     * @see ServerType
     */
    virtual ServerType getServerType() const = 0;

    virtual ~IServerInfo() {}
};

typedef boost::shared_ptr<IServerInfo> IServerInfoPtr;

} /* namespace kaa */

#endif /* ISERVERINFO_HPP_ */
