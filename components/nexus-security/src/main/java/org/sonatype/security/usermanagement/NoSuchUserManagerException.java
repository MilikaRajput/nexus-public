/*
 * Sonatype Nexus (TM) Open Source Version
 * Copyright (c) 2008-present Sonatype, Inc.
 * All rights reserved. Includes the third-party code listed at http://links.sonatype.com/products/nexus/oss/attributions.
 *
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License Version 1.0,
 * which accompanies this distribution and is available at http://www.eclipse.org/legal/epl-v10.html.
 *
 * Sonatype Nexus (TM) Professional Version is available from Sonatype, Inc. "Sonatype" and "Sonatype Nexus" are trademarks
 * of Sonatype, Inc. Apache Maven is a trademark of the Apache Software Foundation. M2eclipse is a trademark of the
 * Eclipse Foundation. All other trademarks are the property of their respective owners.
 */
package org.sonatype.security.usermanagement;

/**
 * Thrown when UserManager could not be found.
 *
 * @author Brian Demers
 */
public class NoSuchUserManagerException
    extends Exception
{

  private static final long serialVersionUID = -2561129270233203244L;

  public NoSuchUserManagerException() {
  }

  public NoSuchUserManagerException(String message, Throwable cause) {
    super(message, cause);
  }

  public NoSuchUserManagerException(String message) {
    super(message);
  }

  public NoSuchUserManagerException(Throwable cause) {
    super(cause);
  }

}