package com.manacher.manacher_rtc.interfaces;

import com.manacher.manacher_rtc.utils.IceCandidateServer;
import com.manacher.manacher_rtc.utils.Offer;

import org.webrtc.SessionDescription;

public interface RTCObserver {
    void onIceCandidate(IceCandidateServer iceCandidateServer);

    void onInvitation(Offer offer, SessionDescription.Type type);
}
