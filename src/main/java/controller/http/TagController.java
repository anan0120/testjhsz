package controller.http;

import com.example.model.Tag;
import net.csdn.annotation.rest.At;
import net.csdn.modules.http.ApplicationController;
import net.csdn.modules.http.RestRequest;
import net.csdn.modules.http.ViewType;

public class TagController extends ApplicationController {
    @At(path = "/tag", types = {RestRequest.Method.POST})
    public void save() {
        Tag tag = Tag.create(params());
        if (tag.save()) {
            render(200, "成功", ViewType.string);
        }
        render(400, "失败", ViewType.string);
    }

    @At(path = "/tag/{id}", types = {RestRequest.Method.GET})
    public void find() {
        Tag tag = Tag.where(map("name", param("id"))).singleFetch();
        if (tag == null) {
            render(404, map());
        }
        render(404, list(tag));

    }
}
