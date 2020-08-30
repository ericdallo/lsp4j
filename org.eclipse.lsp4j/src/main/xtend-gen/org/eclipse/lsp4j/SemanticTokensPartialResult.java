/**
 * Copyright (c) 2016-2018 TypeFox and others.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0,
 * or the Eclipse Distribution License v. 1.0 which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 * 
 * SPDX-License-Identifier: EPL-2.0 OR BSD-3-Clause
 */
package org.eclipse.lsp4j;

import com.google.common.annotations.Beta;
import java.util.List;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;
import org.eclipse.lsp4j.util.Preconditions;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * @since 3.16.0
 */
@Beta
@SuppressWarnings("all")
public class SemanticTokensPartialResult {
  @NonNull
  private List<Integer> data;
  
  public SemanticTokensPartialResult(@NonNull final List<Integer> data) {
    this.data = Preconditions.<List<Integer>>checkNotNull(data, "data");
  }
  
  @Pure
  @NonNull
  public List<Integer> getData() {
    return this.data;
  }
  
  public void setData(@NonNull final List<Integer> data) {
    this.data = Preconditions.checkNotNull(data, "data");
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("data", this.data);
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
    SemanticTokensPartialResult other = (SemanticTokensPartialResult) obj;
    if (this.data == null) {
      if (other.data != null)
        return false;
    } else if (!this.data.equals(other.data))
      return false;
    return true;
  }
  
  @Override
  @Pure
  public int hashCode() {
    return 31 * 1 + ((this.data== null) ? 0 : this.data.hashCode());
  }
}
