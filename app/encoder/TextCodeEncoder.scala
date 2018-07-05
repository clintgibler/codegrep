package encoder

import models.TokenModel

object TextCodeEncoder extends CodeEncoder {
  override def parse(content: String): List[TokenModel] = {
    List.empty
  }
}
