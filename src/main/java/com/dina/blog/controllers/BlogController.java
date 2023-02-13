package com.dina.blog.controllers;

import com.dina.blog.models.Post;
import com.dina.blog.repo.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BlogController {
    @Autowired
    private PostRepository postRepository;
@GetMapping
    public String BlogMain(Model model){
    Iterable<Post> posts=postRepository.findAll();
    model.addAttribute("posts",  "posts");
    return "blog-main";
}
@PostMapping("add")
    public String blogPostAdd(@RequestParam String title,@RequestParam String anons,@RequestParam String full_text, Model model){
    Post post=new Post(title,anons,full_text);
    postRepository.save(post);
    return "redirect:/home";

}

}
