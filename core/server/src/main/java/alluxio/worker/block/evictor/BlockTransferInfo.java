/*
 * Licensed to the University of California, Berkeley under one or more contributor license
 * agreements. See the NOTICE file distributed with this work for additional information regarding
 * copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License. You may obtain a
 * copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package alluxio.worker.block.evictor;

import alluxio.worker.block.BlockStoreLocation;

import javax.annotation.concurrent.ThreadSafe;

/**
 * Provides information about the transfer of a block.
 */
@ThreadSafe
public class BlockTransferInfo {
  private final long mBlockId;
  private final BlockStoreLocation mSrcLocation;
  private final BlockStoreLocation mDstLocation;

  /**
   * Creates a new instance of {@link BlockTransferInfo}.
   *
   * @param blockId the block id
   * @param srcLocation the source {@link BlockStoreLocation}
   * @param dstLocation the destination {@link BlockStoreLocation}
   */
  public BlockTransferInfo(long blockId, BlockStoreLocation srcLocation,
      BlockStoreLocation dstLocation) {
    mBlockId = blockId;
    mSrcLocation = srcLocation;
    mDstLocation = dstLocation;
  }

  /**
   * @return the block id
   */
  public long getBlockId() {
    return mBlockId;
  }

  /**
   * @return the source {@link BlockStoreLocation}
   */
  public BlockStoreLocation getSrcLocation() {
    return mSrcLocation;
  }

  /**
   * @return the destination {@link BlockStoreLocation}
   */
  public BlockStoreLocation getDstLocation() {
    return mDstLocation;
  }

  @Override
  public String toString() {
    return "blockId: " + mBlockId + ", srcLocation: " + mSrcLocation
        + ", destLocation: " + mDstLocation;
  }
}