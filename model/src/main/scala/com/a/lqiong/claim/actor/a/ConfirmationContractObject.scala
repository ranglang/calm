package com.lqiong.claim.actor.a

import com.lqiong.contact.ContractDetailStockList
import io.circe.generic.JsonCodec

sealed trait ContractAccountReply
case object ConfirmationOk extends ContractAccountReply

@JsonCodec
case class ConfirmationContractState(list: List[ContractDetailStockList])
    extends ContractAccountReply
case class ConfirmationContractObject() extends ContractAccountReply
