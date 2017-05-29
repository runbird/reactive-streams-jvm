/************************************************************************
 * Licensed under Public Domain (CC0)                                    *
 *                                                                       *
 * To the extent possible under law, the person who associated CC0 with  *
 * this code has waived all copyright and related or neighboring         *
 * rights to this code.                                                  *
 *                                                                       *
 * You should have received a copy of the CC0 legalcode along with this  *
 * work. If not, see <http://creativecommons.org/publicdomain/zero/1.0/>.*
 ************************************************************************/

package org.reactivestreams.tck.support;

/**
 * Internal TCK use only.
 * Add / Remove tests for SubscriberBlackboxVerification here to make sure that they arre added/removed in the other places.
 */
public interface SubscriberBlackboxVerificationRules {
  void required_spec201_blackbox_mustSignalDemandViaSubscriptionRequest() throws Throwable;
  void untested_spec202_blackbox_shouldAsynchronouslyDispatch() throws Exception;
  void required_spec203_blackbox_mustNotCallMethodsOnSubscriptionOrPublisherInOnComplete() throws Throwable;
  void required_spec203_blackbox_mustNotCallMethodsOnSubscriptionOrPublisherInOnError() throws Throwable;
  void untested_spec204_blackbox_mustConsiderTheSubscriptionAsCancelledInAfterRecievingOnCompleteOrOnError() throws Exception;
  void required_spec205_blackbox_mustCallSubscriptionCancelIfItAlreadyHasAnSubscriptionAndReceivesAnotherOnSubscribeSignal() throws Exception;
  void untested_spec206_blackbox_mustCallSubscriptionCancelIfItIsNoLongerValid() throws Exception;
  void untested_spec207_blackbox_mustEnsureAllCallsOnItsSubscriptionTakePlaceFromTheSameThreadOrTakeCareOfSynchronization() throws Exception;
  void untested_spec208_blackbox_mustBePreparedToReceiveOnNextSignalsAfterHavingCalledSubscriptionCancel() throws Throwable;
  void required_spec209_blackbox_mustBePreparedToReceiveAnOnCompleteSignalWithPrecedingRequestCall() throws Throwable;
  void required_spec209_blackbox_mustBePreparedToReceiveAnOnCompleteSignalWithoutPrecedingRequestCall() throws Throwable;
  void required_spec210_blackbox_mustBePreparedToReceiveAnOnErrorSignalWithPrecedingRequestCall() throws Throwable;
  void required_spec210_blackbox_mustBePreparedToReceiveAnOnErrorSignalWithoutPrecedingRequestCall() throws Throwable;
  void untested_spec211_blackbox_mustMakeSureThatAllCallsOnItsMethodsHappenBeforeTheProcessingOfTheRespectiveEvents() throws Exception;
  void untested_spec212_blackbox_mustNotCallOnSubscribeMoreThanOnceBasedOnObjectEquality() throws Throwable;
  void untested_spec213_blackbox_failingOnSignalInvocation() throws Exception;
  void required_spec213_blackbox_onSubscribe_mustThrowNullPointerExceptionWhenParametersAreNull() throws Throwable;
  void required_spec213_blackbox_onNext_mustThrowNullPointerExceptionWhenParametersAreNull() throws Throwable;
  void required_spec213_blackbox_onError_mustThrowNullPointerExceptionWhenParametersAreNull() throws Throwable;
  void untested_spec301_blackbox_mustNotBeCalledOutsideSubscriberContext() throws Exception;
  void untested_spec308_blackbox_requestMustRegisterGivenNumberElementsToBeProduced() throws Throwable;
  void untested_spec310_blackbox_requestMaySynchronouslyCallOnNextOnSubscriber() throws Exception;
  void untested_spec311_blackbox_requestMaySynchronouslyCallOnCompleteOrOnError() throws Exception;
  void untested_spec314_blackbox_cancelMayCauseThePublisherToShutdownIfNoOtherSubscriptionExists() throws Exception;
  void untested_spec315_blackbox_cancelMustNotThrowExceptionAndMustSignalOnError() throws Exception;
  void untested_spec316_blackbox_requestMustNotThrowExceptionAndMustOnErrorTheSubscriber() throws Exception;
}
