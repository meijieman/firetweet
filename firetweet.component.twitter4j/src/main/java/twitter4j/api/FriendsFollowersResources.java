/*
 * Firetweet - Twitter client for Android
 *
 *  Copyright (C) 2012-2015 Mariotaku Lee <mariotaku.lee@gmail.com>
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package twitter4j.api;

import twitter4j.CursorPaging;
import twitter4j.Friendship;
import twitter4j.IDs;
import twitter4j.PageableResponseList;
import twitter4j.Relationship;
import twitter4j.ResponseList;
import twitter4j.TwitterException;
import twitter4j.User;

/**
 * @author Joern Huxhorn - jhuxhorn at googlemail.com
 */
public interface FriendsFollowersResources {

	/**
	 * Allows the authenticating users to follow the user specified in the ID
	 * parameter.<br>
	 * Returns the befriended user in the requested format when successful.
	 * Returns a string describing the failure condition when unsuccessful. If
	 * you are already friends with the user an HTTP 403 will be returned. <br>
	 * This method calls http://api.twitter.com/1.1/friendships/create/[id].json
	 * 
	 * @param userId the ID of the user to be befriended
	 * @return the befriended user
	 * @throws twitter4j.TwitterException when Twitter service or network is unavailable
	 * @see <a
	 *      href="https://dev.twitter.com/docs/api/1.1/post/friendships/create">POST
	 *      friendships/create | Twitter Developers</a>
	 * @since Twitter4J 2.1.0
	 */
	User createFriendship(long userId) throws TwitterException;

	/**
	 * Allows the authenticating users to follow the user specified in the ID
	 * parameter.<br>
	 * Returns the befriended user in the requested format when successful.
	 * Returns a string describing the failure condition when unsuccessful. If
	 * you are already friends with the user an HTTP 403 will be returned. <br>
	 * This method calls http://api.twitter.com/1.1/friendships/create/[id].json
	 *
	 * @param userId the ID of the user to be befriended
	 * @param follow Enable notifications for the target user in addition to
	 *            becoming friends.
	 * @return the befriended user
	 * @throws twitter4j.TwitterException when Twitter service or network is unavailable
	 * @see <a
	 *      href="https://dev.twitter.com/docs/api/1.1/post/friendships/create">POST
	 *      friendships/create | Twitter Developers</a>
	 * @since Twitter4J 2.1.0
	 */
	User createFriendship(long userId, boolean follow) throws TwitterException;

	/**
	 * Allows the authenticating users to follow the user specified in the ID
	 * parameter.<br>
	 * Returns the befriended user in the requested format when successful.
	 * Returns a string describing the failure condition when unsuccessful. If
	 * you are already friends with the user an HTTP 403 will be returned. <br>
	 * This method calls http://api.twitter.com/1.1/friendships/create/[id].json
	 *
	 * @param screenName the screen name of the user to be befriended
	 * @return the befriended user
	 * @throws twitter4j.TwitterException when Twitter service or network is
	 *             unavailable
	 * @see <a
	 *      href="https://dev.twitter.com/docs/api/1.1/post/friendships/create">POST
	 *      friendships/create | Twitter Developers</a>
	 * @since Twitter4J 2.0.1
	 */
	User createFriendship(String screenName) throws TwitterException;

	/**
	 * Allows the authenticating users to follow the user specified in the ID
	 * parameter.<br>
	 * Returns the befriended user in the requested format when successful.
	 * Returns a string describing the failure condition when unsuccessful. If
	 * you are already friends with the user an HTTP 403 will be returned. <br>
	 * This method calls http://api.twitter.com/1.1/friendships/create/[id].json
	 *
	 * @param screenName the screen name of the user to be befriended
	 * @param follow Enable notifications for the target user in addition to
	 *            becoming friends.
	 * @return the befriended user
	 * @throws twitter4j.TwitterException when Twitter service or network is unavailable
	 * @see <a
	 *      href="https://dev.twitter.com/docs/api/1.1/post/friendships/create">POST
	 *      friendships/create | Twitter Developers</a>
	 * @since Twitter4J 2.0.2
	 */
	User createFriendship(String screenName, boolean follow) throws TwitterException;

	/**
	 * Allows the authenticating users to unfollow the user specified in the ID
	 * parameter.<br>
	 * Returns the unfollowed user in the requested format when successful.
	 * Returns a string describing the failure condition when unsuccessful. <br>
	 * This method calls
	 * http://api.twitter.com/1.1/friendships/destroy/[id].json
	 *
	 * @param userId the ID of the user for whom to request a list of friends
	 * @return User
	 * @throws twitter4j.TwitterException when Twitter service or network is unavailable
	 * @see <a
	 *      href="https://dev.twitter.com/docs/api/1.1/post/friendships/destroy">POST
	 *      friendships/destroy | Twitter Developers</a>
	 * @since Twitter4J 2.1.0
	 */
	User destroyFriendship(long userId) throws TwitterException;

	/**
	 * Allows the authenticating users to unfollow the user specified in the ID
	 * parameter.<br>
	 * Returns the unfollowed user in the requested format when successful.
	 * Returns a string describing the failure condition when unsuccessful. <br>
	 * This method calls
	 * http://api.twitter.com/1.1/friendships/destroy/[id].json
	 *
	 * @param screenName the screen name of the user for whom to request a list
	 *            of friends
	 * @return User
	 * @throws twitter4j.TwitterException when Twitter service or network is unavailable
	 * @see <a
	 *      href="https://dev.twitter.com/docs/api/1.1/post/friendships/destroy">POST
	 *      friendships/destroy | Twitter Developers</a>
	 * @since Twitter4J 2.0.1
	 */
	User destroyFriendship(String screenName) throws TwitterException;

	IDs getFollowersIDs(CursorPaging paging) throws TwitterException;

	IDs getFollowersIDs(long userId, CursorPaging paging) throws TwitterException;

	IDs getFollowersIDs(String screenName, CursorPaging paging) throws TwitterException;

	PageableResponseList<User> getFollowersList(CursorPaging paging) throws TwitterException;

	PageableResponseList<User> getFollowersList(long userId, CursorPaging paging) throws TwitterException;

	PageableResponseList<User> getFollowersList(String screenName, CursorPaging paging) throws TwitterException;

	IDs getFriendsIDs(CursorPaging paging) throws TwitterException;

	IDs getFriendsIDs(long userId, CursorPaging paging) throws TwitterException;

	IDs getFriendsIDs(String screenName, CursorPaging paging) throws TwitterException;

	PageableResponseList<User> getFriendsList(CursorPaging paging) throws TwitterException;

	PageableResponseList<User> getFriendsList(long userId, CursorPaging paging) throws TwitterException;

	PageableResponseList<User> getFriendsList(String screenName, CursorPaging paging) throws TwitterException;

	/**
	 * Returns an array of numeric IDs for every user who has a pending request
	 * to follow the authenticating user. <br>
	 * This method calls http://api.twitter.com/1.1/friendships/incoming.json
	 *
	 * @param paging Breaks the results into pages. A single page contains 5000
	 *            identifiers. Provide a value of -1 to begin paging.
	 * @return an array of numeric IDs for every user who has a pending request
	 *         to follow the authenticating user.
	 * @throws twitter4j.TwitterException when Twitter service or network is unavailable
	 * @see <a
	 *      href="https://dev.twitter.com/docs/api/1.1/get/friendships/incoming">GET
	 *      friendships/incoming | Twitter Developers</a>
	 * @since Twitter4J 2.1.2
	 */
	IDs getIncomingFriendships(CursorPaging paging) throws TwitterException;

	/**
	 * Returns an array of numeric IDs for every protected user for whom the
	 * authenticating user has a pending follow request. <br>
	 * This method calls http://api.twitter.com/1.1/friendships/outgoing.json
	 *
	 * @param paging Breaks the results into pages. A single page contains 5000
	 *            identifiers. Provide a value of -1 to begin paging.
	 * @return an array of numeric IDs for every protected user for whom the
	 *         authenticating user has a pending follow request.
	 * @throws twitter4j.TwitterException when Twitter service or network is unavailable
	 * @see <a
	 *      href="https://dev.twitter.com/docs/api/1.1/get/friendships/outgoing">GET
	 *      friendships/outgoing | Twitter Developers</a>
	 * @since Twitter4J 2.1.2
	 */
	IDs getOutgoingFriendships(CursorPaging paging) throws TwitterException;

	/**
	 * Returns the relationship of the authenticating user to the specified
	 * users. <br>
	 * This method has not been finalized and the interface is subject to change
	 * in incompatible ways. <br>
	 * This method calls http://api.twitter.com/1.1/friendships/lookup.json
	 *
	 * @param ids array of the ids to lookup
	 * @return list of Relationships
	 * @throws twitter4j.TwitterException when Twitter service or network is unavailable
	 * @see <a
	 *      href="http://groups.google.com/group/twitter-api-announce/msg/34909da7c399169e">#newtwitter
	 *      and the API - Twitter API Announcements | Google Group</a>
	 * @since Twitter4J 2.1.9
	 */
	ResponseList<Friendship> lookupFriendships(long[] ids) throws TwitterException;

	/**
	 * Returns the relationship of the authenticating user to the specified
	 * users. <br>
	 * This method has not been finalized and the interface is subject to change
	 * in incompatible ways. <br>
	 * This method calls http://api.twitter.com/1.1/friendships/lookup.json
	 *
	 * @param screenNames array of the screen names to lookup
	 * @return list of Relationships
	 * @throws twitter4j.TwitterException when Twitter service or network is unavailable
	 * @see <a
	 *      href="http://groups.google.com/group/twitter-api-announce/msg/34909da7c399169e">#newtwitter
	 *      and the API - Twitter API Announcements | Google Group</a>
	 * @since Twitter4J 2.1.9
	 */
	ResponseList<Friendship> lookupFriendships(String[] screenNames) throws TwitterException;

	/**
	 * Returns detailed information about the relationship between two users. <br>
	 * This method calls http://api.twitter.com/1.1/friendships/show.json
	 *
	 * @param sourceId the ID of the source user
	 * @param targetId the ID of the target user
	 * @return Relationship
	 * @throws twitter4j.TwitterException when Twitter service or network is unavailable
	 * @see <a
	 *      href="https://dev.twitter.com/docs/api/1.1/get/friendships/show">GET
	 *      friendships/show | Twitter Developers</a>
	 * @since Twitter4J 2.1.0
	 */
	Relationship showFriendship(long sourceId, long targetId) throws TwitterException;

	/**
	 * Returns detailed information about the relationship between two users. <br>
	 * This method calls http://api.twitter.com/1.1/friendships/show.json
	 *
	 * @param sourceScreenName the screen name of the source user
	 * @param targetScreenName the screen name of the target user
	 * @return Relationship
	 * @throws twitter4j.TwitterException when Twitter service or network is unavailable
	 * @see <a
	 *      href="https://dev.twitter.com/docs/api/1.1/get/friendships/show">GET
	 *      friendships/show | Twitter Developers</a>
	 * @since Twitter4J 2.1.0
	 */
	Relationship showFriendship(String sourceScreenName, String targetScreenName) throws TwitterException;

	/**
	 * Allows you to enable or disable retweets and device notifications from
	 * the specified user. <br>
	 * This method has not been finalized and the interface is subject to change
	 * in incompatible ways. <br>
	 * This method calls http://api.twitter.com/1.1/friendships/update.json
	 *
	 * @param userId user id to update
	 * @param enableDeviceNotification set true to enable device notification
	 * @param retweets set true to enable retweets
	 * @return Relationship
	 * @throws twitter4j.TwitterException when Twitter service or network is unavailable
	 * @see <a
	 *      href="http://groups.google.com/group/twitter-api-announce/msg/34909da7c399169e">#newtwitter
	 *      and the API - Twitter API Announcements | Google Group</a>
	 * @since Twitter4J 2.1.9
	 */
	Relationship updateFriendship(long userId, boolean enableDeviceNotification, boolean retweets)
			throws TwitterException;

	/**
	 * Allows you to enable or disable retweets and device notifications from
	 * the specified user. <br>
	 * This method has not been finalized and the interface is subject to change
	 * in incompatible ways. <br>
	 * This method calls http://api.twitter.com/1.1/friendships/update.json
	 *
	 * @param screenName screen name to update
	 * @param enableDeviceNotification set true to enable device notification
	 * @param retweets set true to enable retweets
	 * @return Relationship
	 * @throws twitter4j.TwitterException when Twitter service or network is unavailable
	 * @see <a
	 *      href="http://groups.google.com/group/twitter-api-announce/msg/34909da7c399169e">#newtwitter
	 *      and the API - Twitter API Announcements | Google Group</a>
	 * @since Twitter4J 2.1.9
	 */
	Relationship updateFriendship(String screenName, boolean enableDeviceNotification, boolean retweets)
			throws TwitterException;
}
