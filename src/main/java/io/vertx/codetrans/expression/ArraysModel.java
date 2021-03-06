package io.vertx.codetrans.expression;

import io.vertx.codegen.type.TypeInfo;
import io.vertx.codetrans.CodeBuilder;
import io.vertx.codetrans.MethodSignature;
import io.vertx.codetrans.TypeArg;

import java.util.List;

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
public class ArraysModel extends ClassModel {

  public ArraysModel(CodeBuilder builder) {
    super(builder);
  }

  @Override
  public ExpressionModel onMethodInvocation(TypeInfo receiverType, MethodSignature method, TypeInfo returnType, List<TypeArg> typeArguments, List<ExpressionModel> arguments, List<TypeInfo> argumentTypes) {
    if (method.getName().equals("asList")) {
      return builder.render(writer -> {
        writer.renderListLiteral(arguments);
      });
    }
    return super.onMethodInvocation(receiverType, method, returnType, typeArguments, arguments, argumentTypes);
  }
}
