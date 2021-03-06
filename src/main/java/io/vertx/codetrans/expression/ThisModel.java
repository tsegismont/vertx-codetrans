package io.vertx.codetrans.expression;

import io.vertx.codetrans.CodeBuilder;
import io.vertx.codetrans.CodeWriter;
import io.vertx.codetrans.expression.ExpressionModel;

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
public class ThisModel extends ExpressionModel {

  public ThisModel(CodeBuilder builder) {
    super(builder);
  }

  @Override
  public void render(CodeWriter writer) {
    writer.renderThis();
  }
}
