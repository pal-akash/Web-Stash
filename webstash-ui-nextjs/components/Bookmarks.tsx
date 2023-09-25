import React from "react"
import { BookmarkResponse } from "@/services/models";
import Bookmark from "./Bookmark";
import Pagination from "./Pagination";

interface BookmarksProps {
    bookmarks: BookmarkResponse
}

const Bookmarks: React.FC<BookmarksProps> = ({bookmarks}) => (
    <div>
        <Pagination bookmarks={bookmarks}/>
        {bookmarks.data.map(bookmark => <Bookmark key={bookmark.id} bookmark={bookmark}/>)}
    </div>
);

export default Bookmarks;