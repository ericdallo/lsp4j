/**
 * Copyright (c) 2017, 2019 Kichwa Coders Ltd. and others.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0,
 * or the Eclipse Distribution License v. 1.0 which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 * 
 * SPDX-License-Identifier: EPL-2.0 OR BSD-3-Clause
 */
package org.eclipse.lsp4j.debug;

import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * Arguments for 'restartFrame' request.
 */
@SuppressWarnings("all")
public class RestartFrameArguments {
  /**
   * Restart this stackframe.
   */
  private int frameId;
  
  /**
   * Restart this stackframe.
   */
  @Pure
  public int getFrameId() {
    return this.frameId;
  }
  
  /**
   * Restart this stackframe.
   */
  public void setFrameId(final int frameId) {
    this.frameId = frameId;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("frameId", this.frameId);
    return b.toString();
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    RestartFrameArguments other = (RestartFrameArguments) obj;
    if (other.frameId != this.frameId)
      return false;
    return true;
  }
  
  @Override
  @Pure
  public int hashCode() {
    return 31 * 1 + this.frameId;
  }
}
