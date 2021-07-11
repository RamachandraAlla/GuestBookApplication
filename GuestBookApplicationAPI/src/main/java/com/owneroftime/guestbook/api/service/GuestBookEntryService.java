package com.owneroftime.guestbook.api.service;

import com.owneroftime.guestbook.api.model.GuestBookEntryModel;

import java.util.List;

/**
 * 
 * @author Ram
 * This is the Guest Book Entry Service Interface which is having all the functions
 *
 */
public interface GuestBookEntryService {

    void createGuestBookEntry(GuestBookEntryModel guestBookEntryModel);

    List<GuestBookEntryModel> getAllGuestBookEntries();

    void deleteGuestBookEntries(String guestBookEntryIds);

    void approveGuestBookEntries(String guestBookEntryIds);

    List<GuestBookEntryModel> getAllGuestBookEntriesForUser(Long userId);

    void updateGuestEntry(GuestBookEntryModel guestBookEntryModel);
}
