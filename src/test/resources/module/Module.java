package module;

import io.vertx.core.buffer.Buffer;
import io.vertx.codetrans.annotations.CodeTranslate;
import io.vertx.codetrans.ModuleTest;

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
public class Module {

  @CodeTranslate
  public void start() throws Exception {
    ModuleTest.buffer = Buffer.buffer("the_buffer");
    ModuleTest.toString = Buffer.buffer("the_buffer").toString("UTF-8");
  }
}
